/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an EC2 instance.
 * </p>
 */
public class Instance implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A description of the current lifecycle state. Note that the
     * <code>Quarantined</code> state is not used.
     * </p>
     */
    private String lifecycleState;
    /**
     * <p>
     * The health status of the instance.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     */
    private String launchConfigurationName;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the instance is running.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     * 
     * @return The Availability Zone in which the instance is running.
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the instance is running.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Instance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A description of the current lifecycle state. Note that the
     * <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. Note that the
     *        <code>Quarantined</code> state is not used.
     * @see LifecycleState
     */
    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * A description of the current lifecycle state. Note that the
     * <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @return A description of the current lifecycle state. Note that the
     *         <code>Quarantined</code> state is not used.
     * @see LifecycleState
     */
    public String getLifecycleState() {
        return this.lifecycleState;
    }

    /**
     * <p>
     * A description of the current lifecycle state. Note that the
     * <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. Note that the
     *        <code>Quarantined</code> state is not used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifecycleState
     */
    public Instance withLifecycleState(String lifecycleState) {
        setLifecycleState(lifecycleState);
        return this;
    }

    /**
     * <p>
     * A description of the current lifecycle state. Note that the
     * <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. Note that the
     *        <code>Quarantined</code> state is not used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifecycleState
     */
    public void setLifecycleState(LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState.toString();
    }

    /**
     * <p>
     * A description of the current lifecycle state. Note that the
     * <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. Note that the
     *        <code>Quarantined</code> state is not used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifecycleState
     */
    public Instance withLifecycleState(LifecycleState lifecycleState) {
        setLifecycleState(lifecycleState);
        return this;
    }

    /**
     * <p>
     * The health status of the instance.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instance.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the instance.
     * </p>
     * 
     * @return The health status of the instance.
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status of the instance.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Instance withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     * 
     * @param launchConfigurationName
     *        The launch configuration associated with the instance.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     * 
     * @return The launch configuration associated with the instance.
     */
    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     * 
     * @param launchConfigurationName
     *        The launch configuration associated with the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Instance withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: " + getLifecycleState() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: "
                    + getLaunchConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAvailabilityZone() == null
                ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(
                        this.getAvailabilityZone()) == false)
            return false;
        if (other.getLifecycleState() == null
                ^ this.getLifecycleState() == null)
            return false;
        if (other.getLifecycleState() != null
                && other.getLifecycleState().equals(this.getLifecycleState()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getLaunchConfigurationName() == null
                ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null
                && other.getLaunchConfigurationName().equals(
                        this.getLaunchConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLifecycleState() == null) ? 0 : getLifecycleState()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0
                        : getLaunchConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}