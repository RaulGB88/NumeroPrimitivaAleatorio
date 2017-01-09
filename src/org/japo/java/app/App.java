/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Instanciación del método Random.
        Random rnd = new Random(System.currentTimeMillis());

        //Constantes.
        final int MIN = 0;
        final int MAX = 49;
        final int VECES_MAX = 5;

        //Instanciación del Array con cada número que forma la papeleta de la Primitiva.
        int numero[] = new int[VECES_MAX];

        //Obtiene un número aleatorio que forma parte de la papeleta de la primitiva.
        //Repite el proceso 5 veces para obtener un número completo de la papeleta de la Primitiva.
        try {
            for (int veces = 0; veces < VECES_MAX; veces++) {

                numero[veces] = rnd.nextInt(MAX - MIN + 1) + MIN;
            }
        } catch (Exception e) {
        }

        //Mensaje con el número de la papeleta de Primitiva.
        System.out.printf("Número de la Primitiva.....: %d-%d-%d-%d-%d", numero[0], numero[1], numero[2], numero[3], numero[4]);
    }

}
