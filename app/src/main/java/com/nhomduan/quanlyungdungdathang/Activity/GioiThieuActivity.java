package com.nhomduan.quanlyungdungdathang.Activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nhomduan.quanlyungdungdathang.R;

public class GioiThieuActivity extends AppCompatActivity {
    private TextView tvGT;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioi_thieu);
        initView();
        setUpToolbar();
    }

    private void initView() {
        tvGT = findViewById(R.id.tvGT);
        toolbar = findViewById(R.id.toolbar);
        tvGT.setText(
                "Hiện tại app đặt đồ ăn online Oder-Food chỉ mới hoạt động tại thành phố Hà Nội. " +
                        "Tuy ra đời chưa lâu nhưng Oder Food cũng chiếm được " +
                        "cảm tình của đông đảo người dùng bởi số lượng quán " +
                        "ăn nhiều và tốc độ giao hàng khá nhanh. App được " +
                        "thiết kế với giao diện dễ sử dụng nên phù hợp với " +
                        "cả những người lớn tuổi. " +
                        "Ngoài ra ứng dụng cũng có nhiều chương trình khuyến mãi hấp dẫn. " +
                        "Tuy nhiên hạn chế lớn nhất của ứng dụng chính là " +
                        "không có hình ảnh thực tế của món ăn. " +
                        "Người dùng không thể đặt nhiều đơn cùng " +
                        "một lúc và không hỗ trợ thanh toán qua thẻ " +
                        "hoặc ví điện tử. Nhiều khách hàng cũng phàn nàn tình trạng " +
                        "hủy đơn còn xảy ra khá thường xuyên."
        );
    }

    private void setUpToolbar() {
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(v -> GioiThieuActivity.this.onBackPressed());
    }
}