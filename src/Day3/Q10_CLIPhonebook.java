package Day3;

import java.util.Scanner;

public class Q10_CLIPhonebook {
	private static String[] names = new String[100];
    private static String[] phones = new String[100];
    private static int contactCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Phonebook Ready. Commands: ADD, DEL, FIND, LIST, EXIT");
		
		while(true) {
			System.out.print("> ");
			String input = sc.nextLine().trim();
			if(input.isEmpty()) continue;
			
			// Split input into parts: [COMMAND, NAME, PHONE]
			String[] parts = input.split(" ");
			String action = parts[0].toUpperCase();
			
			switch(action) {
				case "ADD":
					if(parts.length < 3) System.out.println("Usage: ADD name phone");
					else addContact(parts[1],parts[2]);
					break;
				case "DEL":
                    if (parts.length < 2) System.out.println("Usage: DEL name");
                    else deleteContact(parts[1]);
                    break;
                case "FIND":
                    if (parts.length < 2) System.out.println("Usage: FIND substring");
                    else findContact(parts[1]);
                    break;
                case "LIST":
                    listContacts();
                    break;
                case "EXIT":
                    System.out.println("Goodbye.");
                    return;
                default:
                    System.out.println("Unknown command.");
			}
		}

	}

	private static void addContact(String name, String phone) {
		if(contactCount > 100) {
			System.out.println("Phonebook full!");
            return;
		}
		if(phone.length() != 10) {
			System.out.println("Error: Phone must be 10 digits.");
            return;
		}
		for (char c : phone.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Error: Phone must contain digits only.");
                return;
            }
        }
		for(int i=0;i<names.length;i++) {
			if(names[i] == null) {
				names[i] = name;
				phones[i] = phone;
				contactCount++;
				System.out.println("Added " + name);
                return;
			}
		}
		
	}
	
	private static void deleteContact(String name) {
		for(int i=0;i<names.length;i++) {
			if(names[i] != null && names[i].equalsIgnoreCase(name)) {
				names[i] = null;
				phones[i] = null;
				contactCount--;
				System.out.println("Deleted " + name);
                return;
			}
		}
		System.out.println("Contact not found.");
	}
	
	private static void findContact(String substring) {
		boolean found = false;
		for(int i=0;i<names.length;i++) {
			if(names[i] != null && names[i].toLowerCase().contains(substring.toLowerCase())) {
				System.out.println("Found: " + names[i] + "(" + phones[i] + ")");
                found = true;	
			}
		}
		if (!found) System.out.println("No matches.");
	}
	private static void listContacts() {
        if (contactCount == 0) {
            System.out.println("Phonebook is empty.");
            return;
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + "(" + phones[i] + ")");
            }
        }
    }

}
