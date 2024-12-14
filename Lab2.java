/* ІО-25 Савельєв Артем
 * Залікова книжка: 2526
 * C3 = 0 => тип: StringBuilder
 * C17 = 10 => З кожного речення заданого тексту видалити підрядок найбільшої довжини, що починається та закінчується заданими літерами.
 */

public class Lab2 {
	
    public static void main(String[] args) {
		// ввід даних
        StringBuilder text = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras efficitur "
		+ "interdum sem, non elementum mauris ullamcorper vel. Suspendisse luctus ipsum eu orci cursus, ac consequat dui "
		+ "varius. Ut a iaculis lorem, vitae dignissim dui. Donec commodo, enim vel imperdiet auctor, ante nisl bibendum "
		+ "ligula, fermentum efficitur mauris felis a augue. Ut est arcu, fermentum a commodo nec, finibus in sapien. "
		+ "Duis placerat enim malesuada blandit ultricies. Integer eu massa id est congue efficitur id eu tellus. Morbi "
		+ "consectetur scelerisque aliquet. Mauris feugiat tortor eu diam imperdiet, eu cursus odio dignissim. Phasellus "
		+ "vehicula, nulla vitae semper eleifend, nulla ex convallis lectus, sit amet convallis nisl justo ac purus.");
		
		String startLetter = "e";	// indexOf та lastIndexOF потребують string як перший аргумент,
		String endLetter = "a";		// а як виконати лабораторну без цих методів, я не впевнений
		
		System.out.println("Початкова форма тексту:");
		System.out.println(text);
		System.out.println("\nУ кожному реченні будуть видалені найбільші підрядки, які починаються літерами '"
		+ startLetter + "' та закінчуються літерами '" + endLetter + "'.\n");
		
		// виконання завдання
		int prevDotIndex = 0;
		int nextDotIndex = text.indexOf(".", prevDotIndex);
		while (nextDotIndex != -1){
			int startIndex = text.indexOf(startLetter, prevDotIndex);
			int endIndex = text.lastIndexOf(endLetter, nextDotIndex) + 1;
			if (startIndex < endIndex && startIndex != -1) {
				text.replace(startIndex, endIndex, "");
			}
			prevDotIndex = text.indexOf(".", prevDotIndex) + 1;
			nextDotIndex = text.indexOf(".", prevDotIndex);
		}
		System.out.println("Вихідний текст:");
		System.out.println(text);	// вивід фінального тексту
	}
}