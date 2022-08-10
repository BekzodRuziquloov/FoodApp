package space.beka.foodapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.R
import com.example.foodapp.utils.MySharedPreferense
import kotlinx.android.synthetic.main.activity_phone_type.*

class PhoneType : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MySharedPreferense.init(this)
        setContentView(R.layout.activity_phone_type)
tv_artel.setOnClickListener {

}
        tv_huawei.setOnClickListener {

        }
        tv_iphone.setOnClickListener {

        }
        tv_samsung.setOnClickListener {

        }
        tv_mi.setOnClickListener {

        }
        tv_sony.setOnClickListener {

        }

    }
}