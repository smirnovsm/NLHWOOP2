public class Radio {
    public int currentStation;
    public int currentVolume;

    /*
    Клиент должен иметь возможность выставлять номер
    радиостанции через прямое указание её номера.
    Для этого подойдёт один обычный метод-сеттер
    с проверкой на допустимость номера станции.
    Номер текущей радиостанции может принимать значения
    только в пределах от 0 до 9
     */
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0) {
            if (newCurrentStation <= 9) {
                currentStation = newCurrentStation;
            }
        }
    }

    /*
    Если текущая радиостанция 9 и клиент нажал
    на кнопку next (=вызвал одноимённый метод next, с англ. — следующая)
    на пульте, то текущей должна стать нулевая.
    В остальных случаях при нажатии на эту же кнопку радио
    переключается просто на следующую станцию.
     */

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else if (currentStation >= 0) {
            currentStation++;
        }
    }

    /*
    Если текущая радиостанция 0 и клиент нажал
    на кнопку prev (=вызвал одноимённый метод prev, с англ. — предыдущая)
    на пульте, то текущей должна стать девятая.
    В остальных случаях радио переключается
    просто на предыдущую станцию.
     */

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else if (currentStation <= 9) {
            currentStation--;
        }
    }

    /*
    Клиент должен иметь возможность увеличивать и уменьшать
    уровень громкости звука в пределах от 0 до 100.
    Если уровень громкости звука достиг максимального значения,
    то дальнейшее нажатие на + не должно ни к чему приводить.
    Если уровень громкости звука достиг минимального значения,
    то дальнейшее нажатие на - не должно ни к чему приводить.

     */

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            if (newCurrentVolume <= 100) {
                currentVolume = newCurrentVolume;
            }
        }
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
