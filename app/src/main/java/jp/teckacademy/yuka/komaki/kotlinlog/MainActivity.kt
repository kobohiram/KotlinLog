package jp.teckacademy.yuka.komaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス

        val human=Human("大谷翔平",28,"今年のMVP")
        human.say()
        human.think()

        val human2=Human("松本潤",39,"徳川家康の役作り")
        human2.say()
        human2.think()


    }

}