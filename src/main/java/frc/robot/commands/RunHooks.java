// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Hooks;
import frc.robot.subsystems.Intake;

public class RunHooks extends Command {
  /** Creates a new RunHooks. */

  Hooks hooks;
  Arm m_arms;
  XboxController xbox;
  double speed;

  public RunHooks(Hooks Hooks, Arm Arms, double Speed) {
    
    hooks = Hooks;
    m_arms = Arms;
    speed = Speed;
 
    addRequirements(Hooks);
      
  }
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_arms.CurrentAngle < 0) {
    hooks.RunHooks(speed);

    } else {
    hooks.RunHooks(0);

    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    hooks.RunHooks(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}
