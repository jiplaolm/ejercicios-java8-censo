/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

import java.util.List;
import java.util.Map;

public class ReductionExamples {

    public static void main(String... args) {
        
        // Crear una lista de personas para poder realizar los ejercicios que se plantean a continuación

        List<Person> censo = Person.createRoster();
        System.out.println("Censo de personas:");
        
        censo
            .stream()
            .forEach(p -> p.printPerson());

        System.out.println();

        // 1. Mostrar la edad media de las personas de genero MASCULINO (utilizar método average())
        // TODO implementar
        
        
        // 2. Mostrar la suma de las edades (método sum())
        
        Integer totalAge = null; // TODO: Completar
            
        System.out.println("Suma de las edades (método sum()): " +
            totalAge);
        
        // 3. Mostrar la suma de las edades -  reduce(identity, accumulator)
        
        Integer totalAgeReduce =  null; // TODO: completar
            
        System.out.println(
            "Suma de las edades (método reduce(identity, accumulator)):  " +
            totalAgeReduce);
         
        // 4. Mostrar la edad media de las personas de genero MASCULINO
        // utilizando el método collect y Averager
         
        Averager averageCollect = null; // TODO completar
                   
        System.out.println("Average age of male members: " +
            averageCollect.average());
         
        // 5.  Mostrar los nombres de las personas de genero FEMENINO utilizando 
        // el método collect

        System.out.println("Nombre de las mujeres: ");         
        List<String> namesOfFemaleMembersCollect = null;    // TODO: completar

        namesOfFemaleMembersCollect
            .stream()
            .forEach(System.out::println);
             
        // 6. Mostrar las personas agrupadas por por genero
         
        System.out.println("Personas por genero:");
        Map<Person.Sex, List<Person>> byGender = null; // TODO: completar
                
        
         
        // 7. Mostrar los nombres de las personas por géner
         
        System.out.println("Nombres por genero:");
        Map<Person.Sex, List<String>> namesByGender = null; // TODO: completar
         
        // 8. Mostrar la suma de las edades por genero - utilizar Collectors.reducing
        
        System.out.println("Suma de las edades por genero:");
        Map<Person.Sex, Integer> totalAgeByGender = null; // TODO: completar
             
        // 9. Mostrar la edad media por genero
         
        System.out.println("Edad media por genero:");
        Map<Person.Sex, Double> averageAgeByGender = null; //TODO: completar
    }
}
