public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    private static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if(!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {  // Validación de los números según criterio solicitado (usando función isValid).
            return false;
        }
        int firstNumberLastDigit = firstNumber % 10;  // Creo 3 variables para alojar el último dígito de su variable respectiva.
        int secondNumberLastDigit = secondNumber % 10;
        int thirdNumberLastDigit = thirdNumber % 10;

        return firstNumberLastDigit == secondNumberLastDigit ||  // Retorna true si existe al menos 1 concordancia entre los dígitos.
                firstNumberLastDigit == thirdNumberLastDigit ||
                secondNumberLastDigit == thirdNumberLastDigit;
    }
    private static boolean isValid(int number) {  // Función usada para validar cada parámetro en la función principal.
        return number>=10 && number<=1000;
    }
}
