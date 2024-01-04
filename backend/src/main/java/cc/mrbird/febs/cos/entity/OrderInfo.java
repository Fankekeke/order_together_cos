package cc.mrbird.febs.cos.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 订单管理
 *
 * @author FanK
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private String code;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 目的地
     */
    private Integer addressId;

    /**
     * 所属用户
     */
    private Integer userId;

    /**
     * 订单状态 1.待付款 2.待收货 3.已收货
     */
    private Integer orderStatus;

    /**
     * 下单时间
     */
    private String createDate;

    @TableField(exist = false)
    private String commodityName;

    @TableField(exist = false)
    private String userName;

    @TableField(exist = false)
    private String shopName;

    @TableField(exist = false)
    private Integer type;

}
