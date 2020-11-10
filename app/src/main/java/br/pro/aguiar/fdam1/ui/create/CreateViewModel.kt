package br.pro.aguiar.fdam1.ui.create

import android.util.Log
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.model.Usuario

class CreateViewModel : ViewModel() {

    fun cadastrarUsuario(
        usuario: String,
        senha: String
    ): Boolean {
        Usuario(usuario, 70, "999999999", 1992)
            .store()
        Log.i("CreateViewModel", "$usuario cadastrado com sucesso.")
        return true
    }

}