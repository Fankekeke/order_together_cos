package cc.mrbird.febs.cos.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 公告信息
 *
 * @author FanK
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BulletinInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 公告时间
     */
    private String date;

    /**
     * 图册
     */
    private String images;

    /**
     * 上下架（0.下架 1.发布）
     */
    private Integer rackUp;

    /**
     * 消息类型（1.通知 2.公告）
     */
    private Integer type;

    /**
     * 发布人
     */
    private String publisher;


}
