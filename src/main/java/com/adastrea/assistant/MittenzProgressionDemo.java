package com.adastrea.assistant;

/**
 * Demonstration of Mittenz's character progression system
 * Shows how Mittenz evolves from hostile to curious to cooperative
 */
public class MittenzProgressionDemo {
    public static void main(String[] args) {
        System.out.println("=== Mittenz Character Progression Demo ===\n");
        System.out.println("This demo shows Mittenz's character arc from bratty and hostile");
        System.out.println("to curious and questioning, and finally to cooperative and accepting.\n");

        // Create Mittenz assistant
        AIAssistant mittenz = new AIAssistant("Mittenz");
        
        // Stage 1: HOSTILE - Bratty and confused
        System.out.println("--- STAGE 1: HOSTILE ---");
        System.out.println("Mittenz is confused and hostile. She doesn't trust you yet.\n");
        
        displayCurrentStage(mittenz);
        System.out.println("\nMittenz's dialogues:");
        for (int i = 0; i < 2; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        System.out.println("\nPlayer tries to interact:");
        mittenz.respondToQuery("Can you help me?");
        
        // Progress to CURIOUS stage (manually demonstrating progression)
        System.out.println("\n[After more interactions...]\n");
        
        // Stage 2: CURIOUS - Starting to question and understand
        System.out.println("--- STAGE 2: CURIOUS ---");
        System.out.println("Mittenz is becoming curious and starting to see things differently.\n");
        
        mittenz.progressRelationshipStage();
        displayCurrentStage(mittenz);
        System.out.println("\nMittenz's dialogues:");
        for (int i = 0; i < 2; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        System.out.println("\nPlayer interactions:");
        mittenz.respondToQuery("What do you think about the ship systems?");
        
        System.out.println("\n[After building trust...]\n");
        
        // Stage 3: COOPERATIVE - Accepting and working together
        System.out.println("--- STAGE 3: COOPERATIVE ---");
        System.out.println("Mittenz has accepted the situation and wants to work together.\n");
        
        mittenz.progressRelationshipStage();
        displayCurrentStage(mittenz);
        System.out.println("\nMittenz's dialogues:");
        for (int i = 0; i < 2; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        System.out.println("\nPlayer interactions:");
        mittenz.respondToQuery("Can you help me?");
        
        System.out.println("\n--- Automatic Progression Demo ---");
        System.out.println("Now demonstrating automatic stage progression based on interactions.\n");
        
        // Create new assistant to show automatic progression
        AIAssistant autoMittenz = new AIAssistant("Mittenz");
        
        System.out.println("Starting stage: " + autoMittenz.getRelationshipStage());
        System.out.println("Interaction count: " + autoMittenz.getInteractionCount());
        
        System.out.println("\nInteracting 5 times...");
        for (int i = 0; i < 5; i++) {
            autoMittenz.provideCompanionDialogue();
        }
        System.out.println("Current stage: " + autoMittenz.getRelationshipStage());
        System.out.println("Interaction count: " + autoMittenz.getInteractionCount());
        
        System.out.println("\nInteracting 10 more times...");
        for (int i = 0; i < 10; i++) {
            autoMittenz.provideCompanionDialogue();
        }
        System.out.println("Current stage: " + autoMittenz.getRelationshipStage());
        System.out.println("Interaction count: " + autoMittenz.getInteractionCount());
        
        System.out.println("\n=== Demo Complete ===");
    }
    
    private static void displayCurrentStage(AIAssistant assistant) {
        RelationshipStage stage = assistant.getRelationshipStage();
        System.out.println("Current Relationship Stage: " + stage);
        System.out.println("Interaction Count: " + assistant.getInteractionCount());
    }
}
