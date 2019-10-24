package tads.eaj.ufrn.exemplopageview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import android.view.LayoutInflater
import android.widget.ImageView


class PersonagemAdapter(var context:Context, var personagens:List<Personagem>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.personagem_inflater, container, false)
        val img:ImageView = view.findViewById(R.id.imagemPersonagem)
        img.setImageResource(personagens[position].imagem)
        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun getCount(): Int {
        return personagens.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return personagens[position].nome
    }
}