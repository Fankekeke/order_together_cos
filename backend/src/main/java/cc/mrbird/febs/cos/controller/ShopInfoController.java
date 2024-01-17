package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.ShopInfo;
import cc.mrbird.febs.cos.service.IShopInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author FanK
 */
@RestController
@RequestMapping("/cos/shop-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShopInfoController {

    private final IShopInfoService shopInfoService;

    /**
     * 分页查询商铺信息
     *
     * @param page     分页对象
     * @param shopInfo 商铺信息
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<ShopInfo> page, ShopInfo shopInfo) {
        return R.ok(shopInfoService.getShopInfoByPage(page, shopInfo));
    }

    /**
     * 删除商铺信息
     *
     * @param ids 主键
     * @return 结果
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(shopInfoService.removeByIds(ids));
    }

}
