package starcraft;
//수송기
// 8개의 지상유닛을 태울 수 있다
public class DropShip extends FlyingUnit {
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = -1;

    //유닛 하나를 태운다, 메소드 load
    // 태웠으면 return true, 못 태우면 return false

    public boolean load(GroundUnit unit) {
        if (units.length -1 == loadedIndex) {
            return false;
        } else {
            units[++loadedIndex] = unit;
            return true;
        }
        // 유닛 하나를 떨군다. 메소드명 unload


    }
        public GroundUnit unload() {

            if (loadedIndex == -1) {
                return null;
            }

        GroundUnit groundUnit = units[loadedIndex];
            units[loadedIndex--] = null;
            return groundUnit;
        }
}



