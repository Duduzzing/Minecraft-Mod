package com.dudu.entitymod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelDino extends ModelBase
{
 
    public ModelRenderer head;
    public ModelRenderer jaw;
    public ModelRenderer neck;
    public ModelRenderer body;
    public ModelRenderer waist;
    
    public ModelRenderer rightArm;
    public ModelRenderer rightForeArm;
    
    public ModelRenderer leftArm;
    public ModelRenderer leftForeArm;
    
    public ModelRenderer rightLeg;
    public ModelRenderer rightForeLeg;
    public ModelRenderer rightFoot;
    
    public ModelRenderer leftLeg;
    public ModelRenderer leftForeLeg;
    public ModelRenderer leftFoot;
    
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer tail5;
  
  public ModelDino()
  {
	  this.textureWidth = 256;
	  this.textureHeight = 128;

	  this.neck = new ModelRenderer(this, 52, 0);
      this.neck.addBox(-3F, -16F, -4F, 6, 20, 8);
      this.neck.setRotationPoint(0F, -6F, -14F);
      this.setRotation(this.neck, 0.7679449F, 0F, 0F);
      
      this.head = new ModelRenderer(this, 0, 0);
      this.head.addBox(-4F, -15F, -22F, 8, 8, 18);
      //this.head.setRotationPoint(0F, -6F, -14F);
      this.setRotation(this.head, -0.7679449F, 0F, 0F);
      this.neck.addChild(this.head);
      
      this.jaw = new ModelRenderer(this, 0, 0);
      this.jaw.addBox(-3.5F, 0F, -11F, 7, 2, 12);
      this.jaw.setRotationPoint(0F, -7F, -10F);
      this.head.addChild(this.jaw);
    
      this.body = new ModelRenderer(this, 0, 28);
      this.body.addBox(-6F, -6F, -19F, 12, 12, 22);
      this.body.setRotationPoint(0F, 0F, 0F);
      
      this.waist = new ModelRenderer(this, 70, 28);
      this.waist.addBox(-5F, -5F, 3F, 10, 10, 12);
      this.body.addChild(this.waist);
      
      this.rightArm = new ModelRenderer(this, 0, 62);
      this.rightArm.addBox(-4F, -2F, -3F, 4, 16, 6);
      this.rightArm.setRotationPoint(-6F, -3F, -12F);
      this.setRotation(this.rightArm, 0.7853982F, 0F, 0F);
      
      this.rightForeArm = new ModelRenderer(this, 20, 62);
      this.rightForeArm.addBox(-4F, 10F, -15F, 4, 4, 12);
      rightArm.addChild(this.rightForeArm);
      
      this.leftArm = new ModelRenderer(this, 0, 62);
      this.leftArm.addBox(0F, -2F, -3F, 4, 16, 6);
      this.leftArm.setRotationPoint(6F, -3F, -12F);
      this.leftArm.mirror = true;
      this.setRotation(this.leftArm, 0.7853982F, 0F, 0F);
      
      this.leftForeArm = new ModelRenderer(this, 20, 62);
      this.leftForeArm.addBox(0F, 10F, -15F, 4, 4, 12);
      this.leftForeArm.mirror = true;
      this.leftArm.addChild(this.leftForeArm);
      
      this.rightLeg = new ModelRenderer(this, 70, 52);
      this.rightLeg.addBox(-6F, -3F, -4F, 6, 18, 8);
      this.rightLeg.setRotationPoint(-5F, -1F, 9F);
      this.setRotation(this.rightLeg, -0.1745329F, 0F, 0F);
      
      this.rightForeLeg = new ModelRenderer(this, 100, 52);
      this.rightForeLeg.addBox(-2F, 0F, -3F , 4, 12, 6);
      this.rightForeLeg.setRotationPoint(-3F, 12, 2F);
      
      this.setRotation(this.rightForeLeg, 0.5759587F + 0.1745329F, 0F, 0F);
      this.rightLeg.addChild(this.rightForeLeg);     
      
      this.rightFoot = new ModelRenderer(this, 122, 52);
      this.rightFoot.addBox(-2F, 0F, -1F, 4, 12, 4);
      this.rightFoot.setRotationPoint(0, 12F, 3F);
      
      this.setRotation(this.rightFoot, -1.466077F - 0.576F , 0F, 0F);
      this.rightForeLeg.addChild(this.rightFoot);

      this.leftLeg = new ModelRenderer(this, 70, 52);
      this.leftLeg.addBox(0F, -3F, -4F, 6, 18, 8);
      this.leftLeg.setRotationPoint(5F, -1F, 9F);
      this.leftLeg.mirror = true;
      this.setRotation(this.leftLeg, -0.1745329F, 0F, 0F);
      
      this.leftForeLeg = new ModelRenderer(this, 100, 52);
      this.leftForeLeg.addBox(-2F, 0F, -3F, 4, 12, 6);
      this.leftForeLeg.setRotationPoint(3F, 12, 2F);
      this.leftForeLeg.mirror = true;
      this.setRotation(leftForeLeg, 0.5759587F + 0.1745329F, 0F, 0F);
      leftLeg.addChild(this.leftForeLeg);
      
      this.leftFoot = new ModelRenderer(this, 122, 52);
      this.leftFoot.addBox(-2F, 0F, -1.2F, 4, 12, 4);
      this.leftFoot.setRotationPoint(0, 12F, 3F);
      this.leftFoot.mirror = true;
      this.setRotation(this.leftFoot, -1.466077F - 0.5759587F, 0F, 0F);
      this.leftForeLeg.addChild(this.leftFoot);

      this.tail1 = new ModelRenderer(this, 80, 0);
      this.tail1.addBox(-3F, -4F, 0, 6, 6, 10);
      this.tail1.rotationPointZ = 15F;
      
      this.tail2 = new ModelRenderer(this, 114, 0);
      this.tail2.addBox(-2.5F, -3.5F, 0, 5, 5, 10);
      this.tail2.setRotationPoint(0F, 0F, 10F);
      this.tail1.addChild(this.tail2);
      
      this.tail3 = new ModelRenderer(this, 146, 0);
      this.tail3.addBox(-2F, -3F, 0, 4, 4, 10);
      this.tail3.setRotationPoint(0F, 0F, 10F);
      this.tail2.addChild(this.tail3);
      
      this.tail4 = new ModelRenderer(this, 146, 0);
      this.tail4.addBox(-2F, -3F, 0, 4, 4, 10);
      this.tail4.setRotationPoint(0F, 0F, 10F);
      this.tail3.addChild(this.tail4);

      this.tail5 = new ModelRenderer(this, 146, 0);
      this.tail5.addBox(-2F, -3F, 0, 4, 4, 10);
      this.tail5.setRotationPoint(0F, 0F, 10F);
      this.tail4.addChild(this.tail5);
      
  }
  
  public void render(Entity entity, float f1, float f2, float f3, float f4, float f5,float f6)
  {
    super.render(entity,f1, f2, f3, f4, f5, f6);
    setRotationAngles(entity, f1, f2, f3, f4, f5, f6);
    
    this.neck.render(f6);
    this.body.render(f6);
    this.leftArm.render(f6);
    this.rightArm.render(f6);
    this.rightLeg.render(f6);
    this.leftLeg.render(f6);
    this.tail1.render(f6);
  }
  
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6)
  {
    super.setRotationAngles(f1, f2, f3, f4, f5, f6, entity);

    this.neck.rotateAngleY = f4 / (180F / (float)Math.PI);
    this.neck.rotateAngleX = f5 / (180F / (float)Math.PI) + 0.7679449F;
    
    this.rightArm.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float)Math.PI) * 2.0F * f2 * 0.5F+ 0.7853982F;
    this.leftArm.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 2.0F * f2 * 0.5F+ 0.7853982F;
    
    this.rightLeg.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2 -0.1745329F;
    this.leftLeg.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float)Math.PI) * 1.4F * f2 -0.1745329F;
    
    this.tail1.rotateAngleY = MathHelper.cos(f1 * 0.3F + (float)Math.PI) * 0.2F * f2;
    this.tail2.rotateAngleY = MathHelper.cos(f1 * 0.3F + (float)Math.PI) * 0.3F * f2;
    this.tail3.rotateAngleY = MathHelper.cos(f1 * 0.3F + (float)Math.PI) * 0.4F * f2;
    this.tail4.rotateAngleY = MathHelper.cos(f1 * 0.3F + (float)Math.PI) * 0.5F * f2;
    this.tail5.rotateAngleY = MathHelper.cos(f1 * 0.3F + (float)Math.PI) * 0.6F * f2;
    
    //if standing still
    if(entity.lastTickPosX == entity.posX &&
       entity.lastTickPosY == entity.posY &&
       entity.lastTickPosZ == entity.posZ){

        this.tail1.rotateAngleY += MathHelper.cos(f3 * 0.1F + (float)Math.PI) * 0.2F /2;
        this.tail2.rotateAngleY += MathHelper.cos(f3 * 0.1F + (float)Math.PI) * 0.3F /2;
        this.tail3.rotateAngleY += MathHelper.cos(f3 * 0.1F + (float)Math.PI) * 0.4F /2;
        this.tail4.rotateAngleY += MathHelper.cos(f3 * 0.1F + (float)Math.PI) * 0.5F /2;
        this.tail5.rotateAngleY += MathHelper.cos(f3 * 0.1F + (float)Math.PI) * 0.6F /2;
        
        this.jaw.rotateAngleX = MathHelper.cos(f3 * 0.1F + (float)Math.PI) * 0.2F;	
    }	
    
  }
  
}
