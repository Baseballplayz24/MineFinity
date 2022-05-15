
package net.mcreator.minefinity.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.minefinity.world.inventory.NetherheartForgeGUIMenu;
import net.mcreator.minefinity.network.NetherheartForgeGUIButtonMessage;
import net.mcreator.minefinity.MinefinityMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class NetherheartForgeGUIScreen extends AbstractContainerScreen<NetherheartForgeGUIMenu> {
	private final static HashMap<String, Object> guistate = NetherheartForgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public NetherheartForgeGUIScreen(NetherheartForgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 422;
		this.imageHeight = 228;
	}

	private static final ResourceLocation texture = new ResourceLocation("minefinity:textures/netherheart_forge_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("minefinity:textures/threelongrightarrow.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 47, 0, 0, 48, 16, 48, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("minefinity:textures/soulcoalburning.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 146, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("minefinity:textures/threelongrightarrow.png"));
		this.blit(ms, this.leftPos + 66, this.topPos + 146, 0, 0, 48, 16, 48, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("minefinity:textures/alloyerarrow.png"));
		this.blit(ms, this.leftPos + 312, this.topPos + 39, 0, 0, 48, 32, 48, 32);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Crafting 4x4", 3, 2, -12829636);
		this.font.draw(poseStack, "Instant Smelting via Soul Coal", 12, 182, -12829636);
		this.font.draw(poseStack, "Alloying", 372, 2, -12829636);
		this.font.draw(poseStack, "The Netherheart Forge is a versatile", 111, 74, -12829636);
		this.font.draw(poseStack, "block fit for many different tasks.", 111, 83, -12829636);
		this.font.draw(poseStack, "4x4 craft, insta-smelt or", 111, 92, -12829636);
		this.font.draw(poseStack, "create metal alloys.", 111, 101, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 21, this.topPos + 92, 72, 20, new TextComponent("4x4 Craft"), e -> {
			if (true) {
				MinefinityMod.PACKET_HANDLER.sendToServer(new NetherheartForgeGUIButtonMessage(0, x, y, z));
				NetherheartForgeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 291, this.topPos + 92, 87, 20, new TextComponent("Alloy Metals"), e -> {
		}));
	}
}
