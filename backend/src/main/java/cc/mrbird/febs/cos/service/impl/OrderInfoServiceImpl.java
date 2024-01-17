package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.OrderInfo;
import cc.mrbird.febs.cos.dao.OrderInfoMapper;
import cc.mrbird.febs.cos.entity.UserInfo;
import cc.mrbird.febs.cos.service.ICommodityInfoService;
import cc.mrbird.febs.cos.service.IOrderInfoService;
import cc.mrbird.febs.cos.service.IUserInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

    private final IUserInfoService userInfoService;

    private final ICommodityInfoService commodityInfoService;

    /**
     * 分页查询订单信息
     *
     * @param page      分页对象
     * @param orderInfo 订单信息
     * @return 结果
     */
    @Override
    public IPage<LinkedHashMap<String, Object>> getOrderByPage(Page page, OrderInfo orderInfo) {
        return baseMapper.getOrderByPage(page, orderInfo);
    }

    /**
     * 根据用户ID获取订单
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> orderListByUserId(Integer userId) {
        return baseMapper.orderListByUserId(userId);
    }

    /**
     * 获取主页数据
     *
     * @return 结果
     */
    @Override
    public LinkedHashMap<String, Object> home() {
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        result.put("userNum", userInfoService.count());
        result.put("userAuditNum", userInfoService.count(Wrappers.<UserInfo>lambdaQuery().eq(UserInfo::getType, 2)));
        result.put("orderNum", this.count(Wrappers.<OrderInfo>lambdaQuery().eq(OrderInfo::getOrderStatus, 2)));
        result.put("commodityNum", this.commodityInfoService.count());
        // 订单统计
        result.put("orderRevenueData", baseMapper.orderRevenueData());
        // 本月订单量 本月收益
        result.put("orderMonthRevenue", baseMapper.orderMonthRevenue());
        // 本月收益占比
        result.put("orderPriceRate", baseMapper.orderPriceRate());
        // 商铺收益订单统计
        result.put("shopOrderRate", baseMapper.shopOrderRate());
        // 所有店铺信息
        List<LinkedHashMap<String, Object>> shopList = baseMapper.shopList();
        result.put("shopList", shopList);
        return result;
    }

    /**
     * 根据商铺获取订单统计
     *
     * @param shopId 商铺ID
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> shopOrderRateByComm(Integer shopId) {
        return baseMapper.shopOrderRateByComm(shopId);
    }

    /**
     * 查询用户购物车
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> selGoodsCart(Integer userId) {
        return baseMapper.selGoodsCart(userId);
    }

    /**
     * 根据订单ID获取订单信息
     *
     * @param ids 订单IDs
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> selOrderListByOrderIds(List<String> ids) {
        return baseMapper.selOrderListByOrderIds(ids);
    }

    /**
     * 获取用户所有订单
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> getOrderListByUserId(Integer userId) {
        return baseMapper.getOrderListByUserId(userId);
    }

    /**
     * 根据用户获取卖出的订单
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> getOrderByUserId(Integer userId) {
        return baseMapper.getOrderByUserId(userId);
    }
}
