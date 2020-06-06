package dasdsa.sdn.fragmenttest_20200606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dasdsa.sdn.fragmenttest_20200606.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var  mainAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        mainAdapter = MainViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = mainAdapter

        myTabLayout.setupWithViewPager(myViewPager)

    }


}
