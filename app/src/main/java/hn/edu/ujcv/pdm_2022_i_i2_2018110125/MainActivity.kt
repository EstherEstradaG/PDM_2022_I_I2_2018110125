package hn.edu.ujcv.pdm_2022_i_i2_2018110125

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ToolbarFragment.ToolbarListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onButtonClick(tamaño: Int, texto: String) {
        val textoFragment = supportFragmentManager.findFragmentById(R.id.fraText) as TextFragment
        textoFragment.cambiarPropiedadesTexto(tamaño, texto)
    }
}