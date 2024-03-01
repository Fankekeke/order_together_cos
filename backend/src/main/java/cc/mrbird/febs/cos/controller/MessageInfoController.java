package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.MessageInfo;
import cc.mrbird.febs.cos.service.IMessageInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author FanK
 */
@RestController
@RequestMapping("/cos/message-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MessageInfoController {

    private final IMessageInfoService messageInfoService;

    /**
     * 分页查询消息
     *
     * @param page        分页对象
     * @param messageInfo 消息信息
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<MessageInfo> page, MessageInfo messageInfo) {
        return R.ok(messageInfoService.getMessageByPage(page, messageInfo));
    }

    /**
     * 删除评价信息
     *
     * @param ids 主键
     * @return 结果
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(messageInfoService.removeByIds(ids));
    }

    /**
     * 根据用户编号获取联系人
     *
     * @param userCode 用户编号
     * @return 结果
     */
    @GetMapping("/contact/person")
    public R selectContactPerson(@RequestParam("userCode") String userCode, @RequestParam("flag") Integer flag) {
        return R.ok(messageInfoService.selectContactPerson(userCode, flag));
    }

}
