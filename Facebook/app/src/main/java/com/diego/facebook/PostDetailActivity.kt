package com.diego.facebook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_post_detail.*

class PostDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_detail)

        if (intent.hasExtra(POST_CONTENT)) {
            postDetailTitle.text = intent.getStringExtra(POST_CONTENT)
        }
    }

    companion object {
        const val POST_CONTENT = "POST_CONTENT"
    }
}
