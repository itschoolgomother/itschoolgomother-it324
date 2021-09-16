


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(36, 0).addBox(-6.0F, -21.6F, -4.8F, 12.0F, 7.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-6.0F, -37.0F, -2.0F, 12.0F, 16.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, -5.0F, 3.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -4.0F, -1.0F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1745F, 0.0F, -0.3491F);
		cube_r3.setTextureOffset(69, 30).addBox(-4.0F, -12.0F, -1.0F, 1.0F, 17.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0F, -21.0F, -4.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.8291F, 0.2291F, -0.7238F);
		cube_r4.setTextureOffset(45, 68).addBox(-7.8762F, -10.1844F, -2.0557F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.8F, -3.9F, 3.0F);
		setRotationAngle(bone3, -0.3491F, 0.0F, -1.1345F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, -4.0F, -1.0F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, -0.3491F);
		cube_r5.setTextureOffset(24, 69).addBox(-4.0F, -12.0F, -1.0F, 1.0F, 17.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, -21.0F, -4.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.8291F, 0.2291F, -0.7238F);
		cube_r6.setTextureOffset(8, 64).addBox(-7.8762F, -10.1844F, -2.0557F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.8F, -3.9F, 3.0F);
		setRotationAngle(bone4, -0.3491F, 0.0F, 1.1345F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -4.0F, -1.0F);
		bone4.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.3491F);
		cube_r7.setTextureOffset(68, 56).addBox(3.0F, -12.0F, -1.0F, 1.0F, 17.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.0F, -21.0F, -4.0F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.8291F, -0.2291F, 0.7238F);
		cube_r8.setTextureOffset(0, 64).addBox(5.8762F, -10.1844F, -2.0557F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(22, 22).addBox(-11.0F, -37.0F, -6.0F, 3.0F, 19.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 22).addBox(8.0F, -37.0F, -6.0F, 3.0F, 19.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 25).addBox(11.0F, -37.0F, -5.0F, 1.0F, 15.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(38, 43).addBox(-12.0F, -37.0F, -5.0F, 1.0F, 15.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 13).addBox(-3.0F, -44.0F, -7.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(29, 57).addBox(-4.0F, -45.0F, -7.5F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(3.0F, -45.0F, -7.5F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.0F, -43.0F, -7.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(55, 20).addBox(-6.5F, -15.0F, -4.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 46).addBox(0.5F, -15.0F, -4.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 49).addBox(-6.0F, -10.3F, -2.7F, 5.0F, 11.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(18, 49).addBox(1.0F, -10.3F, -2.7F, 5.0F, 11.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(54, 13).addBox(-3.0F, -39.0F, -1.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r9.setTextureOffset(14, 22).addBox(6.0F, -36.0F, -1.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(30, 71).addBox(-8.0F, -36.0F, -1.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(6.0F, -50.0F, -1.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.8291F, -0.2291F, 0.7238F);
		cube_r10.setTextureOffset(16, 64).addBox(5.8762F, -10.1844F, -2.0557F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -33.0F, 2.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1745F, 0.0F, 0.3491F);
		cube_r11.setTextureOffset(53, 70).addBox(3.0F, -12.0F, -1.0F, 1.0F, 17.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -37.0F, -8.0F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(30, 0).addBox(-2.0F, -2.1F, 1.7F, 4.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}