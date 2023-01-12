package sample2;

public class InverseTransfotmer extends TextTransformer{

	@Override
	public String transform(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		return sb.toString();
	}
}
