package com.ramotion.paperonboarding;

import java.io.Serializable;

/**
 * Represents content for one page of Paper Onboarding
 */
public class PaperOnboardingPage implements Serializable {

    private String titleText;
    private String descriptionText;
    private int bgColor;
    private int titleTextColor;
    private int descriptionTextColor;
    private int titleTextSizeSP;
    private int descriptionTextSizeSP;
    private int contentIconRes;
    private int bottomBarIconRes;

    public PaperOnboardingPage() {
    }

    public PaperOnboardingPage(String titleText, String descriptionText, int bgColor, int contentIconRes, int bottomBarIconRes) {
        this.bgColor = bgColor;
        this.contentIconRes = contentIconRes;
        this.bottomBarIconRes = bottomBarIconRes;
        this.descriptionText = descriptionText;
        this.titleText = titleText;
        titleTextColor = 0;
        descriptionTextColor = 0;
        titleTextSizeSP = 0;
        descriptionTextSizeSP = 0;
    }

    public PaperOnboardingPage(String titleText, String descriptionText, int bgColor,
                               int titleTextColor, int descriptionTextColor, int titleTextSizeSP,
                               int descriptionTextSizeSP, int contentIconRes, int bottomBarIconRes) {
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.bgColor = bgColor;
        this.titleTextColor = titleTextColor;
        this.descriptionTextColor = descriptionTextColor;
        this.titleTextSizeSP = titleTextSizeSP;
        this.descriptionTextSizeSP = descriptionTextSizeSP;
        this.contentIconRes = contentIconRes;
        this.bottomBarIconRes = bottomBarIconRes;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public int getContentIconRes() {
        return contentIconRes;
    }

    public void setContentIconRes(int contentIconRes) {
        this.contentIconRes = contentIconRes;
    }

    public int getBottomBarIconRes() {
        return bottomBarIconRes;
    }

    public void setBottomBarIconRes(int bottomBarIconRes) {
        this.bottomBarIconRes = bottomBarIconRes;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public void setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
    }

    public int getDescriptionTextColor() {
        return descriptionTextColor;
    }

    public void setDescriptionTextColor(int descriptionTextColor) {
        this.descriptionTextColor = descriptionTextColor;
    }

    public int getTitleTextSizeSP() {
        return titleTextSizeSP;
    }

    public void setTitleTextSizeSP(int titleTextSizeSP) {
        this.titleTextSizeSP = titleTextSizeSP;
    }

    public int getDescriptionTextSizeSP() {
        return descriptionTextSizeSP;
    }

    public void setDescriptionTextSizeSP(int descriptionTextSizeSP) {
        this.descriptionTextSizeSP = descriptionTextSizeSP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaperOnboardingPage that = (PaperOnboardingPage) o;

        if (bgColor != that.bgColor) return false;
        if (titleTextColor != that.titleTextColor) return false;
        if (descriptionTextColor != that.descriptionTextColor) return false;
        if (titleTextSizeSP != that.titleTextSizeSP) return false;
        if (descriptionTextSizeSP != that.descriptionTextSizeSP) return false;
        if (contentIconRes != that.contentIconRes) return false;
        if (bottomBarIconRes != that.bottomBarIconRes) return false;
        if (titleText != null ? !titleText.equals(that.titleText) : that.titleText != null)
            return false;
        return descriptionText != null ? descriptionText.equals(that.descriptionText) : that.descriptionText == null;

    }

    @Override
    public int hashCode() {
        int result = titleText != null ? titleText.hashCode() : 0;
        result = 31 * result + (descriptionText != null ? descriptionText.hashCode() : 0);
        result = 31 * result + bgColor;
        result = 31 * result + titleTextColor;
        result = 31 * result + descriptionTextColor;
        result = 31 * result + titleTextSizeSP;
        result = 31 * result + descriptionTextSizeSP;
        result = 31 * result + contentIconRes;
        result = 31 * result + bottomBarIconRes;
        return result;
    }

    @Override
    public String toString() {
        return "PaperOnboardingPage{" +
                "titleText='" + titleText + '\'' +
                ", descriptionText='" + descriptionText + '\'' +
                ", bgColor=" + bgColor +
                ", titleTextColor=" + titleTextColor +
                ", descriptionTextColor=" + descriptionTextColor +
                ", titleTextSizeSP=" + titleTextSizeSP +
                ", descriptionTextSizeSP=" + descriptionTextSizeSP +
                ", contentIconRes=" + contentIconRes +
                ", bottomBarIconRes=" + bottomBarIconRes +
                '}';
    }
}
