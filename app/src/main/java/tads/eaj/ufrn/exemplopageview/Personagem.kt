package tads.eaj.ufrn.exemplopageview

class Personagem(var imagem:Int, var nome:String) {
    companion object{
        fun getListaPersonagem(): List<Personagem> {

            val listaPersonagens = ArrayList<Personagem>()
            listaPersonagens.add(Personagem(R.drawable.img1, "Harry Potter"))
            listaPersonagens.add(Personagem(R.drawable.img2, "Ronald Weasley"))
            listaPersonagens.add(Personagem(R.drawable.img3, "Hermione Granger"))
            listaPersonagens.add(Personagem(R.drawable.img4, "Draco Malfoy"))
            listaPersonagens.add(Personagem(R.drawable.img5, "Albus Dumbledore"))
            listaPersonagens.add(Personagem(R.drawable.img6, "Severus Snape"))
            return listaPersonagens
        }
    }
}