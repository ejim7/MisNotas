package ibarra.kevin.misnotas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private var notas=ArrayList<Nota>()
    private lateinit var adaptador:AdaptarNotas
    private val lista: ListView = findViewById(R.id.listView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //notasPrueba()

        adaptador= AdaptarNotas(this,notas)
        lista.adapter= adaptador
    }
    /*
    private fun notasPrueba(){
        notas.add(Nota("prueba1", "contenido de la prueba 1"))
        notas.add(Nota("prueba2", "contenido de la prueba 2"))
        notas.add(Nota("prueba3", "contenido de la prueba 3"))
    }

     */

}