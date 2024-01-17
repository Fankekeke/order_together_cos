package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.AuditInfo;
import cc.mrbird.febs.cos.entity.ShopInfo;
import cc.mrbird.febs.cos.entity.UserInfo;
import cc.mrbird.febs.cos.service.IAuditInfoService;
import cc.mrbird.febs.cos.service.IShopInfoService;
import cc.mrbird.febs.cos.service.IUserInfoService;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author FanK
 */
@RestController
@RequestMapping("/cos/audit-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuditInfoController {

    private final IAuditInfoService auditInfoService;

    private final IShopInfoService shopInfoService;

    private final IUserInfoService userInfoService;

    /**
     * 分页获取审核信息
     *
     * @param page      分页
     * @param auditInfo 审核信息
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<AuditInfo> page, AuditInfo auditInfo) {
        return R.ok(auditInfoService.getAuditInfoByPage(page, auditInfo));
    }

    /**
     * 审核
     *
     * @param auditId 审核ID
     * @param type    状态
     * @return 结果
     */
    @PutMapping("/check")
    public R check(@RequestParam Integer auditId, @RequestParam Integer type) {
        // 添加商铺
        AuditInfo auditInfo = auditInfoService.getById(auditId);
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setUserId(auditInfo.getUserId());
        shopInfo.setCode("S-" + System.currentTimeMillis());
        shopInfo.setIntroduction(auditInfo.getIntroduction());
        shopInfo.setTag(auditInfo.getTag());
        shopInfoService.save(shopInfo);
        // 修改角色类型
        userInfoService.update(Wrappers.<UserInfo>lambdaUpdate().set(UserInfo::getType, 2).eq(UserInfo::getId, auditInfo.getUserId()));
        return R.ok(auditInfoService.update(Wrappers.<AuditInfo>lambdaUpdate().set(AuditInfo::getStatusDate, DateUtil.formatDateTime(new Date()))
                .set(AuditInfo::getAuditStatus, type).eq(AuditInfo::getId, auditId)));
    }

    /**
     * 删除审核信息
     *
     * @param ids 主键
     * @return 结果
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(auditInfoService.removeByIds(ids));
    }

}
