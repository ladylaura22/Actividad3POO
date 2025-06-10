package programa;

// Librerías necesarias
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import programa.Profesor;

public class MainPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Profesor> profesores = new ArrayList<>();

        // ADDición de profesores
        System.out.println("=== REGISTRO DE 50 PROFESORES ===\n");
        profesores.add(new Profesor("Juan", "Perez", LocalDate.of(1975, 5, 20), "Masculino", 1.75, 70, "A001", "Matemática", 3000, 10));
        profesores.add(new Profesor("Maria", "Lopez", LocalDate.of(1980, 8, 15), "Femenino", 1.65, 60, "A002", "Literatura", 2800, 12));
        profesores.add(new Profesor("Carlos", "Martinez", LocalDate.of(1970, 11, 10), "Masculino", 1.80, 80, "A003", "Física", 3500, 20));
        profesores.add(new Profesor("Ana", "Gomez", LocalDate.of(1985, 2, 25), "Femenino", 1.60, 55, "A004", "Química", 3300, 8));
        profesores.add(new Profesor("Luis", "Ramirez", LocalDate.of(1978, 7, 5), "Masculino", 1.70, 68, "A005", "Biología", 3100, 15));
        profesores.add(new Profesor("Sofia", "Torres", LocalDate.of(1990, 3, 12), "Femenino", 1.58, 52, "A006", "Matemática", 2900, 4));
        profesores.add(new Profesor("Jorge", "Vargas", LocalDate.of(1968, 9, 30), "Masculino", 1.78, 75, "A007", "Historia", 3400, 25));
        profesores.add(new Profesor("Luisa", "Diaz", LocalDate.of(1983, 4, 6), "Femenino", 1.62, 58, "A008", "Inglés", 3000, 7));
        profesores.add(new Profesor("Pedro", "Santos", LocalDate.of(1972, 12, 17), "Masculino", 1.76, 72, "A009", "Física", 3550, 18));
        profesores.add(new Profesor("Clara", "Morales", LocalDate.of(1992, 6, 22), "Femenino", 1.55, 50, "A010", "Tecnología", 2700, 3));
        profesores.add(new Profesor("Andrés", "Paredes", LocalDate.of(1975, 10, 9), "Masculino", 1.82, 85, "A011", "Matemática", 3600, 22));
        profesores.add(new Profesor("Patricia", "León", LocalDate.of(1988, 1, 18), "Femenino", 1.68, 59, "A012", "Educación física", 2900, 9));
        profesores.add(new Profesor("Kevin", "Figueroa", LocalDate.of(1979, 5, 2), "Masculino", 1.73, 67, "A013", "Química", 3200, 11));
        profesores.add(new Profesor("Gabriela", "Cordero", LocalDate.of(1984, 11, 8), "Femenino", 1.60, 53, "A014", "Arte", 2800, 6));
        profesores.add(new Profesor("Raúl", "Navarro", LocalDate.of(1971, 9, 22), "Masculino", 1.75, 70, "A015", "Biología", 3300, 19));
        profesores.add(new Profesor("Martha", "Ortega", LocalDate.of(1991, 2, 3), "Femenino", 1.59, 54, "A016", "Inglés", 2950, 4));
        profesores.add(new Profesor("Oscar", "Vega", LocalDate.of(1969, 8, 28), "Masculino", 1.80, 78, "A017", "Historia", 3400, 24));
        profesores.add(new Profesor("Verónica", "Maldonado", LocalDate.of(1987, 12, 15), "Femenino", 1.63, 56, "A018", "Lengua", 2850, 8));
        profesores.add(new Profesor("Fabián", "López", LocalDate.of(1974, 4, 21), "Masculino", 1.77, 73, "A019", "Matemática", 3500, 16));
        profesores.add(new Profesor("Diana", "Ramos", LocalDate.of(1993, 7, 9), "Femenino", 1.57, 49, "A020", "Filosofía", 2750, 2));
        profesores.add(new Profesor("Mario", "Alonso", LocalDate.of(1976, 10, 3), "Masculino", 1.74, 69, "A021", "Educación física", 3000, 13));
        profesores.add(new Profesor("Carmen", "Reyes", LocalDate.of(1982, 5, 14), "Femenino", 1.66, 57, "A022", "Química", 3150, 10));
        profesores.add(new Profesor("Javier", "Cruz", LocalDate.of(1967, 3, 25), "Masculino", 1.83, 82, "A023", "Física", 3700, 27));
        profesores.add(new Profesor("Lucía", "Guerrero", LocalDate.of(1995, 9, 5), "Femenino", 1.55, 48, "A024", "Arte", 2600, 1));
        profesores.add(new Profesor("Adrián", "Mejía", LocalDate.of(1981, 12, 1), "Masculino", 1.70, 65, "A025", "Lengua", 2950, 14));
        profesores.add(new Profesor("Isabel", "Benítez", LocalDate.of(1973, 6, 19), "Femenino", 1.64, 55, "A026", "Inglés", 3100, 17));
        profesores.add(new Profesor("Sebastián", "Acosta", LocalDate.of(1989, 11, 23), "Masculino", 1.78, 77, "A027", "Matemática", 3550, 9));
        profesores.add(new Profesor("Natalia", "Santos", LocalDate.of(1994, 4, 11), "Femenino", 1.59, 50, "A028", "Filosofía", 2650, 3));
        profesores.add(new Profesor("Jorge", "Orozco", LocalDate.of(1978, 1, 30), "Masculino", 1.76, 70, "A029", "Historia", 3400, 21));
        profesores.add(new Profesor("Sara", "Vidal", LocalDate.of(1986, 7, 16), "Femenino", 1.62, 54, "A030", "Ciencias sociales", 2900, 6));
        profesores.add(new Profesor("Luis", "Ferrer", LocalDate.of(1972, 10, 7), "Masculino", 1.79, 79, "A031", "Educación física", 3550, 23));
        profesores.add(new Profesor("Patricia", "Duarte", LocalDate.of(1990, 12, 25), "Femenino", 1.65, 58, "A032", "Inglés", 3000, 4));
        profesores.add(new Profesor("Raúl", "Pardo", LocalDate.of(1965, 8, 14), "Masculino", 1.75, 72, "A033", "Lengua", 3300, 26));
        profesores.add(new Profesor("Claudia", "Lara", LocalDate.of(1983, 2, 20), "Femenino", 1.63, 56, "A034", "Arte", 2800, 5));
        profesores.add(new Profesor("Hugo", "Vega", LocalDate.of(1977, 9, 9), "Masculino", 1.82, 80, "A035", "Matemática", 3600, 14));
        profesores.add(new Profesor("Monserrat", "Jiménez", LocalDate.of(1992, 3, 18), "Femenino", 1.60, 52, "A036", "Filosofía", 2700, 2));
        profesores.add(new Profesor("Esteban", "Moreno", LocalDate.of(1973, 11, 2), "Masculino", 1.77, 74, "A037", "Historia", 3400, 19));
        profesores.add(new Profesor("Elena", "Castro", LocalDate.of(1989, 5, 30), "Femenino", 1.67, 59, "A038", "Ciencias sociales", 2900, 7));
        profesores.add(new Profesor("Óscar", "Zamora", LocalDate.of(1966, 9, 17), "Masculino", 1.83, 85, "A039", "Física", 3700, 28));
        profesores.add(new Profesor("Verónica", "Ríos", LocalDate.of(1993, 6, 4), "Femenino", 1.58, 49, "A040", "Inglés", 2650, 1));
        profesores.add(new Profesor("Mario", "Calderón", LocalDate.of(1976, 4, 25), "Masculino", 1.74, 69, "A041", "Matemática", 3550, 15));
        profesores.add(new Profesor("Lucía", "Camacho", LocalDate.of(1987, 1, 8), "Femenino", 1.64, 55, "A042", "Arte", 2750, 6));
        profesores.add(new Profesor("Javier", "Méndez", LocalDate.of(1974, 8, 23), "Masculino", 1.78, 76, "A043", "Filosofía", 3500, 17));
        profesores.add(new Profesor("Ana", "Salas", LocalDate.of(1995, 2, 14), "Femenino", 1.59, 50, "A044", "Ciencias sociales", 2650, 2));
        profesores.add(new Profesor("Gerardo", "Varela", LocalDate.of(1969, 12, 2), "Masculino", 1.81, 78, "A045", "Historia", 3400, 24));
        profesores.add(new Profesor("Marta", "Barrera", LocalDate.of(1982, 10, 19), "Femenino", 1.65, 57, "A046", "Lengua", 2850, 11));
        profesores.add(new Profesor("Felipe", "Muñoz", LocalDate.of(1977, 3, 7), "Masculino", 1.76, 72, "A047", "Educación física", 3500, 20));
        profesores.add(new Profesor("Paula", "Díaz", LocalDate.of(1990, 7, 12), "Femenino", 1.62, 54, "A048", "Inglés", 2900, 6));
        profesores.add(new Profesor("Óscar", "Guzmán", LocalDate.of(1968, 11, 27), "Masculino", 1.83, 83, "A049", "Matemática", 3600, 26));
        profesores.add(new Profesor("Isabel", "Serrano", LocalDate.of(1989, 4, 9), "Femenino", 1.60, 50, "A050", "Arte", 2650, 3));
        System.out.println("Profesores iniciales registrados: " + profesores.size());


        System.out.print("¿Cuántos profesores MÁS deseas registrar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea


        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nProfesor #" + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Fecha de nacimiento (AÑO-MES-DÍA): ");
            String fechaNacimientoStr = scanner.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
            System.out.print("Género: ");
            String genero = scanner.nextLine();
            System.out.print("Estatura (metros). Escribe un número decimal CON COMA: ");
            double estatura = scanner.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea
            System.out.print("Código profesor: ");
            String codigo = scanner.nextLine();
            System.out.print("Asignatura: ");
            String asignatura = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            System.out.print("Años de experiencia: ");
            int experiencia = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            Profesor profesor = new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso,
                    codigo, asignatura, salario, experiencia);
            profesores.add(profesor);
        }

        System.out.println("\nProfesores registrados:");
        for (Profesor p : profesores) {
            System.out.println(p);
        }

        scanner.close();
    }
}




