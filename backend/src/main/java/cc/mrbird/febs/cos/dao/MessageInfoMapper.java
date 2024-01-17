package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.MessageInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
public interface MessageInfoMapper extends BaseMapper<MessageInfo> {

    /**
     * 分页查询消息
     *
     * @param page        分页对象
     * @param messageInfo 消息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> getMessageByPage(Page<MessageInfo> page, @Param("messageInfo") MessageInfo messageInfo);

    /**
     * 查询消息信息
     *
     * @param userId 用户ID
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> messageListById(@Param("userId") Integer userId);

    /**
     * 查找聊天记录
     *
     * @param takeUser 发送者
     * @param sendUser 接收人
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> getMessageDetail(@Param("takeUser") Integer takeUser, @Param("sendUser") Integer sendUser);
}
