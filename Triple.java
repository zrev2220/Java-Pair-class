public class Triple<T, S, U>
{
	private T _first;
	private S _second;
	private U _third;

	public Triple() {
		_first = null;
		_second = null;
		_third = null;
	}

	public Triple(T first, S second, U third) {
		_first = first;
		_second = second;
		_third = third;
	}

	T first() { return _first; }
	S second() { return _second; }
	U third() { return _third; }

	public String toString() {
		return first().toString() + " " + second().toString() + " " + third().toString();
	}
}