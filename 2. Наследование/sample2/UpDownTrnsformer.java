package sample2;

public class UpDownTrnsformer extends TextTransformer{

	@Override
	public String transform(String text) {
		String str = "";
		char[] arrText = text.toCharArray();
		for (int i = 0; i < arrText.length; i++) {
			if (i % 2 == 0) {
				arrText[i] = Character.toUpperCase(arrText[i]);
				str = str + arrText[i];
			} else {
				arrText[i] = Character.toLowerCase(arrText[i]);
				str = str + arrText[i];
			}
		}

		return str;
	}

}
