// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsquirrel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "squirrel"), "main");
	private final ModelPart Head;
	private final ModelPart body;
	private final ModelPart leg_fl;
	private final ModelPart leg_fr;
	private final ModelPart leg_bl;
	private final ModelPart leg_br;
	private final ModelPart tail_1;
	private final ModelPart tail_2;

	public Modelsquirrel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.body = root.getChild("body");
		this.leg_fl = root.getChild("leg_fl");
		this.leg_fr = root.getChild("leg_fr");
		this.leg_bl = root.getChild("leg_bl");
		this.leg_br = root.getChild("leg_br");
		this.tail_1 = root.getChild("tail_1");
		this.tail_2 = root.getChild("tail_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -12.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(4.0F)).texOffs(8, 13)
						.addBox(-1.0F, -17.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-1.0F, -17.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(2.0F, -10.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, 18.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -19.0F, -8.0F, 12.0F, 24.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -10.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition leg_fl = partdefinition.addOrReplaceChild("leg_fl", CubeListBuilder.create().texOffs(0, 8)
				.addBox(4.0F, -8.0F, 5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg_fr = partdefinition.addOrReplaceChild("leg_fr", CubeListBuilder.create().texOffs(8, 8)
				.addBox(4.0F, -8.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg_bl = partdefinition.addOrReplaceChild("leg_bl", CubeListBuilder.create().texOffs(40, 5)
				.addBox(-13.0F, -8.0F, 5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg_br = partdefinition.addOrReplaceChild("leg_br", CubeListBuilder.create().texOffs(40, 0)
				.addBox(-13.0F, -8.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_1 = partdefinition.addOrReplaceChild("tail_1", CubeListBuilder.create().texOffs(32, 19)
				.addBox(-19.0F, -31.0F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(4.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_2 = partdefinition.addOrReplaceChild("tail_2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_2_r1 = tail_2.addOrReplaceChild("tail_2_r1",
				CubeListBuilder.create().texOffs(8, 16).addBox(-12.0F, -9.0F, -1.0F, 13.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, -28.0F, -4.0F, 0.0F, 0.0F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_fl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_fr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_bl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_br.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.tail_1.yRot = headPitch / (180F / (float) Math.PI);
		this.tail_2.yRot = headPitch / (180F / (float) Math.PI);
	}
}