package com.linuxboy.tercerapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val negro = "#000000"
        val marron = "#800000"
        val rojo = "#FF0000"
        val naranja = "#FFA500"
        val amarillo = "#FFFF00"
        val verde = "#008000"
        val azul = "#0000FF"
        val pupura = "#800080"
        val gris = "#808080"
        val blanco = "#FFFFFF"
        val dorado = "#FFD700"
        val plateado = "#C0C0C0"

        val lista1 = resources.getStringArray(R.array.banda1)
        val lista2 = resources.getStringArray(R.array.banda2)
        val lista3 = resources.getStringArray(R.array.banda3)
        val lista4 = resources.getStringArray(R.array.banda4)


        calcular_button.setOnClickListener {
            //result_text_view.text = "Hello world \n This is a test"

            val banda1 =
                if (banda1_spinner.selectedItem.toString() == lista1.get(0)) {
                    return@setOnClickListener
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(1)) {
                    10
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(2)) {
                    20
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(3)) {
                    30
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(4)) {
                    40
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(5)) {
                    50
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(6)) {
                    60
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(7)) {
                    70
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(8)) {
                    80
                }
                else if (banda1_spinner.selectedItem.toString() == lista1.get(9)) {
                    90
                }else 0

            val banda2 =
                if (banda2_spinner.selectedItem.toString() == lista2.get(0)) {
                    return@setOnClickListener
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(1)) {
                    0
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(2)) {
                    1
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(3)) {
                    2
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(4)) {
                    3
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(5)) {
                    4
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(6)) {
                    5
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(7)) {
                    6
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(8)) {
                    7
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(9)) {
                    8
                }
                else if (banda2_spinner.selectedItem.toString() == lista2.get(10)) {
                    9
                }
                else 0

            val banda3 =
                if (banda3_spinner.selectedItem.toString() == lista3.get(0)) {
                    return@setOnClickListener
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(1)) {
                    1
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(2)) {
                    10
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(3)) {
                    100
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(4)) {
                    1000
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(5)) {
                    10000
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(6)) {
                    100000
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(7)) {
                    1000000
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(8)) {
                    1/10
                }
                else if (banda3_spinner.selectedItem.toString() == lista3.get(9)) {
                    1/100
                }
                else 0

            val banda4 =
                if (banda4_spinner.selectedItem.toString() == lista4.get(0)) {
                    return@setOnClickListener
                }
                else if (banda4_spinner.selectedItem.toString() == lista4.get(1)) {
                    "1%"
                }
                else if (banda4_spinner.selectedItem.toString() == lista4.get(2)) {
                    "2%"
                }
                else if (banda4_spinner.selectedItem.toString() == lista4.get(3)) {
                    "5%"
                }
                else if (banda4_spinner.selectedItem.toString() == lista4.get(4)) {
                    "10%"
                }
                else 0

            val resultado = (banda1+banda2)*banda3
            ///result_text_view.text = resultado.toString()
            result_text_view.text = getString(R.string.respuesta, resultado.toString(), banda4)

        }




        mostrar_button.setOnClickListener {
            if (banda1_spinner.selectedItem.toString() == lista1.get(0)) {
                return@setOnClickListener
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(1)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(marron))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(2)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(rojo))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(3)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(naranja))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(4)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(amarillo))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(5)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(verde))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(6)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(azul))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(7)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(pupura))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(8)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(gris))
            }
            if (banda1_spinner.selectedItem.toString() == lista1.get(9)) {
                banda1_spinner.setBackgroundColor(Color.parseColor(blanco))
            }


            if (banda2_spinner.selectedItem.toString() == lista2.get(0)) {
                return@setOnClickListener
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(1)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(negro))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(2)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(marron))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(3)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(rojo))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(4)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(naranja))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(5)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(amarillo))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(6)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(verde))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(7)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(azul))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(8)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(pupura))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(9)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(gris))
            }
            if (banda2_spinner.selectedItem.toString() == lista2.get(10)) {
                banda2_spinner.setBackgroundColor(Color.parseColor(blanco))
            }



            if (banda3_spinner.selectedItem.toString() == lista3.get(0)) {
                return@setOnClickListener
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(1)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(negro))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(2)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(marron))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(3)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(rojo))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(4)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(naranja))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(5)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(amarillo))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(6)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(verde))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(7)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(azul))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(8)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(dorado))
            }
            if (banda3_spinner.selectedItem.toString() == lista3.get(9)) {
                banda3_spinner.setBackgroundColor(Color.parseColor(plateado))
            }


            if (banda4_spinner.selectedItem.toString() == lista4.get(0)) {
                return@setOnClickListener
            }
            if (banda4_spinner.selectedItem.toString() == lista4.get(1)) {
                banda4_spinner.setBackgroundColor(Color.parseColor(marron))
            }
            if (banda4_spinner.selectedItem.toString() == lista4.get(2)) {
                banda4_spinner.setBackgroundColor(Color.parseColor(rojo))
            }
            if (banda4_spinner.selectedItem.toString() == lista4.get(3)) {
                banda4_spinner.setBackgroundColor(Color.parseColor(dorado))
            }
            if (banda4_spinner.selectedItem.toString() == lista4.get(4)) {
                banda4_spinner.setBackgroundColor(Color.parseColor(plateado))
            }
        }



    }
}