package jp.teckacademy.yuka.komaki.kotlinlog

import android.util.Log

class Human:Animal,Thinkable {
    //プロパティ
    var hobby:String
    constructor(name:String,age:Int,hobby:String):super (name,age) {

        this.hobby = hobby
    }
    //Animal classのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は"+super.name+"です。歳は"+super.age+"歳です。")
    }
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }
}