package com.diego.facebook

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.diego.facebook.restClient.Service
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity(), FeedAdapter.OnItemClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Service.create().getFeed().enqueue(object : retrofit2.Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                postRecyclerView.apply {
                    adapter = FeedAdapter(this.context, response.body().orEmpty(), this@MainActivity)
                    layoutManager = LinearLayoutManager(this.context)
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                // TODO: Treat error
            }
        })
    }

    override fun onPostClick(post: Post) {
        Toast.makeText(this, "Click on item ${post.title}", Toast.LENGTH_SHORT).show()
    }
}
