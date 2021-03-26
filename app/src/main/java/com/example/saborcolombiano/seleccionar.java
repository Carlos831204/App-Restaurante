package com.example.saborcolombiano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class seleccionar extends AppCompatActivity {

    CheckBox pla1,pla2,pla3,bebi1,bebi2,bebi3,pos1,pos2,pos3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seleccionar);

        pla1=(CheckBox) findViewById(R.id.plato1);
        pla2=(CheckBox) findViewById(R.id.plato2);
        pla3=(CheckBox) findViewById(R.id.plato3);

        bebi1=(CheckBox) findViewById(R.id.bebida1);
        bebi2=(CheckBox) findViewById(R.id.bebida2);
        bebi3=(CheckBox) findViewById(R.id.bebida3);

        pos1=(CheckBox) findViewById(R.id.postre1);
        pos2=(CheckBox) findViewById(R.id.postre2);
        pos3=(CheckBox) findViewById(R.id.postre3);


        Button consulta = findViewById(R.id.consulta);

        consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Mensaje.class);
                startActivityForResult(intent, 0);
                if (v.getId() == R.id.consulta) {
                    validar();
                }
            }
                private void validar () {

                    EditText nom = findViewById(R.id.nom);
                    String nombre = nom.getText().toString();
                    String cad = "Hola " + nombre + " el menú seleccionado es: \n";

                    if (pla1.isChecked() == true) {

                        cad+= "Cazuela de frijoles \n";
                    }

                    if (pla2.isChecked() == true) {

                        cad+= "Bandeja paisa \n";
                    }

                    if (pla2.isChecked() == true) {

                        cad+= "Mondongo \n";
                    }

                    if (bebi1.isChecked() == true) {

                        cad+= "Agua de panela \n";
                    }

                    if (bebi2.isChecked() == true) {

                        cad+= "Chicha \n";
                    }

                    if (bebi3.isChecked() == true) {

                        cad+= "Guarapo \n";
                    }

                    if (pos1.isChecked() == true) {

                        cad+= "Arroz con leche \n";
                    }

                    if (pos2.isChecked() == true) {

                        cad+= "Natilla \n";
                    }

                    if (pos3.isChecked() == true) {

                        cad+= "Plátano calado \n";
                    }


                    Toast toast = Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,10,0);
                    toast.show();
                }
        });


    }
}