package br.pro.aguiar.fdam1.carro.database

import br.pro.aguiar.fdam1.carro.model.Carro

class AppDatabase {

    //private var carro: Carro? = null

    private var carros: MutableList<Carro> = mutableListOf(
        Carro("Ford", "Fiesta", "PJG5L87", 4),
        Carro("Ford", "Ka", "MHD5Ç86", 2),
        Carro("Fiat", "Palio", "JHF8D85", 2)
    )

    fun all(): List<Carro> {
        return carros
    }

    fun store(carro: Carro) {
        carros.add(carro)
    }

    fun delete(carro: Carro) {
        // id
        carros.remove(carro)
    }

    fun update(marca: String, modelo: String, placa: String, portas: Int, carro: Carro) {
        var index = carros.indexOf(carro)
        carro.marca = marca
        carro.modelo = modelo
        carro.placa = placa
        carro.portas = portas
        carros[index] = carro
    }


    companion object {
        private var instance: AppDatabase? = null
        fun getInstance(): AppDatabase {
            if (instance == null)
                instance = AppDatabase()
            return instance as AppDatabase
        }
    }

}