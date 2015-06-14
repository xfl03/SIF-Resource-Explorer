package me.xwang1024.sifResExplorer.dto;

public class CardDTO {
	private int cardId;
	private int cardBaseId;
	private int unitNaviAssetId;
	private int naviLayerOrder;
	private int naviRotation;
	private int naviMoveX;
	private int naviMoveY;
	private double naviSizeRatio;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardBaseId() {
		return cardBaseId;
	}

	public void setCardBaseId(int cardBaseId) {
		this.cardBaseId = cardBaseId;
	}

	public int getUnitNaviAssetId() {
		return unitNaviAssetId;
	}

	public void setUnitNaviAssetId(int unitNaviAssetId) {
		this.unitNaviAssetId = unitNaviAssetId;
	}

	public int getNaviLayerOrder() {
		return naviLayerOrder;
	}

	public void setNaviLayerOrder(int naviLayerOrder) {
		this.naviLayerOrder = naviLayerOrder;
	}

	public int getNaviRotation() {
		return naviRotation;
	}

	public void setNaviRotation(int naviRotation) {
		this.naviRotation = naviRotation;
	}

	public int getNaviMoveX() {
		return naviMoveX;
	}

	public void setNaviMoveX(int naviMoveX) {
		this.naviMoveX = naviMoveX;
	}

	public int getNaviMoveY() {
		return naviMoveY;
	}

	public void setNaviMoveY(int naviMoveY) {
		this.naviMoveY = naviMoveY;
	}

	public double getNaviSizeRatio() {
		return naviSizeRatio;
	}

	public void setNaviSizeRatio(double naviSizeRatio) {
		this.naviSizeRatio = naviSizeRatio;
	}

	@Override
	public String toString() {
		return "CardDTO [cardId=" + cardId + ", cardBaseId=" + cardBaseId + ", unitNaviAssetId="
				+ unitNaviAssetId + ", naviLayerOrder=" + naviLayerOrder + ", naviRotation="
				+ naviRotation + ", naviMoveX=" + naviMoveX + ", naviMoveY=" + naviMoveY
				+ ", naviSizeRatio=" + naviSizeRatio + "]";
	}

}
