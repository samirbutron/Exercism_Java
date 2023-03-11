public class Lasagna {
    int expectedTimeInOven = 40;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expectedTimeInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        return expectedTimeInOven-minutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int minutesInOven) {
        return (layers*2)+(minutesInOven);
    }
}
