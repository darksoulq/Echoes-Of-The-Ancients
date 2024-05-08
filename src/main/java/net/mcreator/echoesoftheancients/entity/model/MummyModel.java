package net.mcreator.echoesoftheancients.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.echoesoftheancients.entity.MummyEntity;

public class MummyModel extends GeoModel<MummyEntity> {
	@Override
	public ResourceLocation getAnimationResource(MummyEntity entity) {
		return new ResourceLocation("echoes_of_the_ancients", "animations/mummy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MummyEntity entity) {
		return new ResourceLocation("echoes_of_the_ancients", "geo/mummy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MummyEntity entity) {
		return new ResourceLocation("echoes_of_the_ancients", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MummyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
