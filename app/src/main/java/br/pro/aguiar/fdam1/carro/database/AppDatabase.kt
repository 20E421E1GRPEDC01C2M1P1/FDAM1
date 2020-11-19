package br.pro.aguiar.fdam1.carro.database

import br.pro.aguiar.fdam1.carro.model.Carro
import br.pro.aguiar.fdam1.carro.model.Opiniao

class AppDatabase {

    //private var carro: Carro? = null

    private var carros: MutableList<Carro> = mutableListOf(
        Carro("Ford", "Fiesta", "PJG5L87", 4,
                listOf(
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo."),
                    Opiniao("Aguiar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo."),
                    Opiniao("Aguiar", "Em bom estado."),
                    Opiniao("João", "Bom preço."),
                    Opiniao("Barbara", "Muito antigo.")
                )
            ),
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