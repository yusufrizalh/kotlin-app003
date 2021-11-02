package id.yusufrizalh.app003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // custom toolbar
    }

    fun courses(view: View) {
        txtInfo.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed enim ut sem viverra aliquet eget sit amet tellus. Dictum sit amet justo donec. At erat pellentesque adipiscing commodo elit at. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio eu. Malesuada nunc vel risus commodo. Tortor vitae purus faucibus ornare suspendisse sed nisi. Quam pellentesque nec nam aliquam sem et tortor consequat. Semper risus in hendrerit gravida rutrum quisque non. Dignissim sodales ut eu sem integer vitae justo eget magna. Aenean pharetra magna ac placerat vestibulum lectus. Et sollicitudin ac orci phasellus. Risus quis varius quam quisque id diam. Tortor at auctor urna nunc id cursus metus aliquam. Rhoncus dolor purus non enim praesent elementum facilisis. Sed euismod nisi porta lorem mollis aliquam. Gravida neque convallis a cras semper. Etiam dignissim diam quis enim."
    }

    fun exams(view: View){
        txtInfo.text = "Nisl rhoncus mattis rhoncus urna neque. Felis imperdiet proin fermentum leo vel orci porta non. Elit eget gravida cum sociis natoque penatibus et. Mi in nulla posuere sollicitudin aliquam ultrices. Amet massa vitae tortor condimentum lacinia quis vel eros. Adipiscing elit duis tristique sollicitudin nibh sit amet commodo nulla. At imperdiet dui accumsan sit amet nulla facilisi. Magna eget est lorem ipsum dolor sit amet consectetur. Feugiat vivamus at augue eget arcu. Tempor orci eu lobortis elementum. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Sed faucibus turpis in eu mi bibendum. Phasellus faucibus scelerisque eleifend donec pretium vulputate sapien. Diam maecenas ultricies mi eget mauris pharetra et."
    }

    fun freelance(view: View){
        txtInfo.text = "Tempor orci dapibus ultrices in iaculis nunc. Vulputate dignissim suspendisse in est. In cursus turpis massa tincidunt dui. Diam sit amet nisl suscipit adipiscing bibendum est ultricies. Tortor dignissim convallis aenean et tortor at risus viverra. Rhoncus mattis rhoncus urna neque viverra. Curabitur gravida arcu ac tortor dignissim convallis aenean et tortor. Sit amet aliquam id diam maecenas ultricies. Morbi tincidunt augue interdum velit euismod in pellentesque massa. Proin sagittis nisl rhoncus mattis rhoncus urna neque. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper. Fermentum posuere urna nec tincidunt praesent. Commodo odio aenean sed adipiscing diam donec adipiscing tristique. Nibh praesent tristique magna sit. Porta nibh venenatis cras sed. Tincidunt dui ut ornare lectus sit. Vel turpis nunc eget lorem dolor sed viverra ipsum. Dolor morbi non arcu risus quis varius. Lorem ipsum dolor sit amet consectetur adipiscing elit."
    }
}