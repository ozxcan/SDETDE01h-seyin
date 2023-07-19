package j10_String_Manipulation_Version01.Tasks;

public class Task15 {
    public static void main(String[] args) {
        // ad ve soyad dan oluşan bir string veriliyor, yer değiştirin
        // input  = "Hasan Can"
        // Output = "Can Hasan"

        String input = "Hüseyin Ince";
        int bosluk = input.indexOf (" ");
        String name = input.substring(0,bosluk);
        String surname = input.substring(bosluk+1);
        System.out.println(surname + " " + name);

    }
}
