package com.xt.api.client.copytrade.spot;

import com.xt.api.dto.CommonResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * @author zhouzhuang
 * @create 2023/9/20 14:28
 */
public interface XtSpotCopyTradeApiService {

    @GET("/v1/copy-trade-order/copy-trade/order/cur-leader-order")
    Call<CommonResponse> getCurLeaderOrder(@QueryMap Map<String, String> params);
}
