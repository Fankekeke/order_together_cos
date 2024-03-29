package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.PostInfo;
import cc.mrbird.febs.cos.service.IPostInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author FanK
 */
@RestController
@RequestMapping("/cos/post-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PostInfoController {

    private final IPostInfoService postInfoService;

    /**
     * 根据贴子ID获取回复信息
     *
     * @param postId 帖子ID
     * @return 结果
     */
    @GetMapping("/reply")
    public R replyInfoByPostId(@RequestParam Integer postId) {
        return R.ok(postInfoService.replyInfoByPostId(postId));
    }

    /**
     * 分页查询帖子信息
     *
     * @param page     分页对象
     * @param postInfo 帖子信息
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<PostInfo> page, PostInfo postInfo) {
        return R.ok(postInfoService.getPostInfoByPage(page, postInfo));
    }

    /**
     * 删除帖子信息
     *
     * @param ids 主键
     * @return 结果
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(postInfoService.removeByIds(ids));
    }

}
