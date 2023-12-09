package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("�����", 52);
        System.out.println(
                "�������� ����: �������� 1 = " + pair1.getFirstValue() + ", �������� 2 = " + pair1.getSecondValue());
        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println(
                "�������� ����: �������� 1 = " + pair2.getFirstValue() + ", �������� 2 = " + pair2.getSecondValue());
        OtherPair<String> otherPair = new OtherPair<>("������", "����");
        System.out.println(
                "�������� ����: �������� 1 = " + otherPair.getFirstValue() + ", �������� 2 = " + otherPair.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    //TODO ����� ���������. ��� ����� ��� new �������� �����������, ������� ����� ���������� �� ��������� ������
    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
