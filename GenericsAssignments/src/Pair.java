import java.util.Date;

public class Pair<T1, T2> {
String key;
Date value;
@Override
public String toString() {
	return "Pair [key=" + key + ", value=" + value + "]";
}
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public Date getValue() {
	return value;
}
public void setValue(Date date) {
	this.value = date;
}
public Pair(String key, Date value) {
	super();
	this.key = key;
	this.value = value;
}
}
