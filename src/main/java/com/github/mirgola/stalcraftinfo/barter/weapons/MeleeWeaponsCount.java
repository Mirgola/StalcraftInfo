package com.github.mirgola.stalcraftinfo.barter.weapons;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MeleeWeaponsCount {
    private final StringProperty nicknameUser;
    private final IntegerProperty mw1701;
    private final IntegerProperty mw1702;
    private final IntegerProperty mw1703;
    private final IntegerProperty mw1704;
    private final IntegerProperty mw1705;
    private final IntegerProperty mw1706;
    private final IntegerProperty mw1707;
    private final IntegerProperty mw1708;
    private final IntegerProperty mw1709;
    private final IntegerProperty mw1710;
    private final IntegerProperty mw1711;
    private final IntegerProperty mw1712;
    private final IntegerProperty mw1713;
    private final IntegerProperty mw1714;
    private final IntegerProperty mw1715;
    private final IntegerProperty mw1716;

    public MeleeWeaponsCount(String nicknameUser, Integer mw1701, Integer mw1702, Integer mw1703, Integer mw1704, Integer mw1705, Integer mw1706,
                             Integer mw1707, Integer mw1708, Integer mw1709, Integer mw1710, Integer mw1711, Integer mw1712, Integer mw1713,
                             Integer mw1714, Integer mw1715, Integer mw1716) {
        this.nicknameUser = new SimpleStringProperty(nicknameUser);
        this.mw1701 = new SimpleIntegerProperty(mw1701);
        this.mw1702 = new SimpleIntegerProperty(mw1702);
        this.mw1703 = new SimpleIntegerProperty(mw1703);
        this.mw1704 = new SimpleIntegerProperty(mw1704);
        this.mw1705 = new SimpleIntegerProperty(mw1705);
        this.mw1706 = new SimpleIntegerProperty(mw1706);
        this.mw1707 = new SimpleIntegerProperty(mw1707);
        this.mw1708 = new SimpleIntegerProperty(mw1708);
        this.mw1709 = new SimpleIntegerProperty(mw1709);
        this.mw1710 = new SimpleIntegerProperty(mw1710);
        this.mw1711 = new SimpleIntegerProperty(mw1711);
        this.mw1712 = new SimpleIntegerProperty(mw1712);
        this.mw1713 = new SimpleIntegerProperty(mw1713);
        this.mw1714 = new SimpleIntegerProperty(mw1714);
        this.mw1715 = new SimpleIntegerProperty(mw1715);
        this.mw1716 = new SimpleIntegerProperty(mw1716);
    }

    // nicknameUser
    public String getNicknameUser() {
        return nicknameUser.get();
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser.set(nicknameUser);
    }

    public StringProperty nicknameUserProperty() {
        return nicknameUser;
    }

    // Изделие 6Х4 – Object 6x4 - mw1701
    public int getMw1701() {
        return mw1701.get();
    }

    public void setMw1701(int mw1701) {
        this.mw1701.set(mw1701);
    }

    public IntegerProperty mw1701Property() {
        return mw1701;
    }

    // КО-1 – KO-1 - mw 1702
    public int getMw1702() {
        return mw1702.get();
    }

    public void setMw1702(int mw1702) {
        this.mw1702.set(mw1702);
    }

    public IntegerProperty mw1702Property() {
        return mw1702;
    }

    // Молоток – Hammer - mw1703
    public int getMw1703() {
        return mw1703.get();
    }

    public void setMw1703(int mw1703) {
        this.mw1703.set(mw1703);
    }

    public IntegerProperty mw1703Property() {
        return mw1703;
    }

    // Нож 6Х9 – 6x9 Knife - mw 1704
    public int getMw1704() {
        return mw1704.get();
    }

    public void setMw1704(int mw1704) {
        this.mw1704.set(mw1704);
    }

    public IntegerProperty mw1704Property() {
        return mw1704;
    }

    // Охотничий нож – Hunters Knife - mw1705
    public int getMw1705() {
        return mw1705.get();
    }

    public void setMw1705(int mw1705) {
        this.mw1705.set(mw1705);
    }

    public IntegerProperty mw1705Property() {
        return mw1705;
    }

    // Glock Feldmesser 78 - Glock Feldmesser 78 - mw 1706
    public int getMw1706() {
        return mw1706.get();
    }

    public void setMw1706(int mw1706) {
        this.mw1706.set(mw1706);
    }

    public IntegerProperty mw1706Property() {
        return mw1706;
    }

    // Монтировка – Crowbar - mw 1707
    public int getMw1707() {
        return mw1707.get();
    }

    public void setMw1707(int mw1707) {
        this.mw1707.set(mw1707);
    }

    public IntegerProperty mw1707Property() {
        return mw1707;
    }

    // Тактический нож Ka-Bar BKR3 – Ka-Bar BKR3 Tactical Knife - mw1708
    public int getMw1708() {
        return mw1708.get();
    }

    public void setMw1708(int mw1708) {
        this.mw1708.set(mw1708);
    }

    public IntegerProperty mw1708Property() {
        return mw1708;
    }

    // ОЦ-04 – Ots-04 - mw1709
    public int getMw1709() {
        return mw1709.get();
    }

    public void setMw1709(int mw1709) {
        this.mw1709.set(mw1709);
    }

    public IntegerProperty mw1709Property() {
        return mw1709;
    }

    // Штык-нож М9 – M9 Bayonet - mw1710
    public int getMw1710() {
        return mw1710.get();
    }

    public void setMw1710(int mw1710) {
        this.mw1710.set(mw1710);
    }

    public IntegerProperty mw1710Property() {
        return mw1710;
    }

    // Охотничий мачете – Hunters Machete - mw1711
    public int getMw1711() {
        return mw1711.get();
    }

    public void setMw1711(int mw1711) {
        this.mw1711.set(mw1711);
    }

    public IntegerProperty mw1711Property() {
        return mw1711;
    }

    // Мачете Survival SP8 Ontario - Survival SP8 Ontario Machete - mw1712
    public int getMw1712() {
        return mw1712.get();
    }

    public void setMw1712(int mw1712) {
        this.mw1712.set(mw1712);
    }

    public IntegerProperty mw1712Property() {
        return mw1712;
    }

    // Кукри – Kukri - mw1713
    public int getMw1713() {
        return mw1713.get();
    }

    public void setMw1713(int mw1713) {
        this.mw1713.set(mw1713);
    }

    public IntegerProperty mw1713Property() {
        return mw1713;
    }

    // Антитеррор – Antiterror - mw1714
    public int getMw1714() {
        return mw1714.get();
    }

    public void setMw1714(int mw1714) {
        this.mw1714.set(mw1714);
    }

    public IntegerProperty mw1714Property() {
        return mw1714;
    }

    // Кувалда – Sledgehammer - mw1715
    public int getMw1715() {
        return mw1715.get();
    }

    public void setMw1715(int mw1715) {
        this.mw1715.set(mw1715);
    }

    public IntegerProperty mw1715Property() {
        return mw1715;
    }

    // Тактическая катана – Tactical katana - mw1716
    public int getMw1716() {
        return mw1716.get();
    }

    public void setMw1716(int mw1716) {
        this.mw1716.set(mw1716);
    }

    public IntegerProperty mw1716Property() {
        return mw1716;
    }
}
