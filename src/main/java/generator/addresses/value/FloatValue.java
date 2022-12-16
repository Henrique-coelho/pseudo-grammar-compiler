package generator.addresses.value;

public class FloatValue extends Value<Float>{
    private Float value;

    public FloatValue(float value){
        this.value = value;
    }

    @Override
    public Float value() {
        return value;
    }
}
