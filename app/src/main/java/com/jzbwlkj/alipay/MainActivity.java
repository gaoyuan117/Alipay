package com.jzbwlkj.alipay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.jzbwlkj.alipay.alipay.AliPay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    private void pay() {
       /* * @param total_amount   订单总价
        * @param subject        标题
        * @param body           描述
        * @param order_trade_no 订单no
        **/

        new AliPay(this).payV2("0.01", "测试", "测试", "12335461357", new AliPay.AlipayCallBack() {
            @Override
            public void onSuccess() {
                Toast.makeText(MainActivity.this, "支付成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDeeling() {

            }

            @Override
            public void onCancle() {

            }

            @Override
            public void onFailure(String msg) {

            }
        });
    }

    public void click(View view) {
        pay();
    }
}
