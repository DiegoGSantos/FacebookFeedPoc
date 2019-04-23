package com.diego.facebook

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        postRecyclerView.apply {
            adapter = FeedAdapter(this.context, posts())
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    private fun posts(): List<Post> {
        return listOf(
            Post("Primeiras reações a Vingadores: Ultimato confirmam final épico para a saga"),
            Post("Já pensou em comprar? Xiaomi Mi Mix 3 tem câmera deslizante e borda mínima"),
            Post("Biometria do Nokia 9 PureView pode ser enganada por pacote de chiclete"),
            Post("Segurança industrial preocupa com 65% dos sistemas desatualizados"),
            Post("Microsoft adianta em 4 anos o fim definitivo do Windows 8"),
            Post("Xiaomi Youth: fone Bluetooth é resistente à água e tem bom custo-benefício"),
            Post("Nubank faz Cade processar grandes bancos por concorrência desleal"),
            Post("Confirmado: Samsung adia o lançamento do Galaxy Fold no mundo todo"),
            Post("Rappi e Ironhack distribuem R$ 300 mil em bolsas de estudo em tecnologia"))
    }
}
