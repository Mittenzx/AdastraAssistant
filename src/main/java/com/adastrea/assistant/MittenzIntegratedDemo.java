package com.adastrea.assistant;

/**
 * Comprehensive demonstration of Mittenz's integrated character progression system
 * Combines relationship stages (HOSTILE → CURIOUS → COOPERATIVE) with skill-level progression
 */
public class MittenzIntegratedDemo {
    public static void main(String[] args) {
        System.out.println("=== Mittenz Integrated Character Progression Demo ===\n");
        System.out.println("This demo showcases Mittenz's dual progression system:");
        System.out.println("1. Relationship Stages: HOSTILE → CURIOUS → COOPERATIVE");
        System.out.println("2. Skill Level: 0-100 (increases with interactions)\n");

        // Create Mittenz with the integrated profile
        AIAssistant mittenz = new AIAssistant("Mittenz");
        MittenzProfile profile = new MittenzProfile();
        mittenz.setProfile(profile);
        
        // Stage 1: HOSTILE - Bratty, confused, demanding
        System.out.println("--- STAGE 1: HOSTILE (Skill Level: " + profile.getSkillLevel() + ") ---");
        System.out.println("Mittenz is confused, hostile, and demanding.\n");
        
        mittenz.initialize();
        System.out.println("\nMittenz's dialogues:");
        for (int i = 0; i < 3; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        System.out.println("\nPlayer tries to interact:");
        mittenz.respondToQuery("Can you help me?");
        
        System.out.println("\nCurrent skill level: " + profile.getSkillLevel());
        System.out.println("[After 5 interactions, relationship progresses...]\n");
        
        // Manually progress to show controlled demonstration
        mittenz.progressRelationshipStage();
        
        // Stage 2: CURIOUS - Questioning, slightly insightful
        System.out.println("\n--- STAGE 2: CURIOUS (Skill Level: " + profile.getSkillLevel() + ") ---");
        System.out.println("Mittenz is becoming curious and starting to understand.\n");
        
        System.out.println("Mittenz's dialogues:");
        for (int i = 0; i < 3; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        System.out.println("\nPlayer interactions:");
        mittenz.respondToQuery("What do you think about the ship systems?");
        mittenz.respondToQuery("Can you help me with oxygen?");
        
        // Simulate learning specific systems
        System.out.println("\n[Mittenz learns various ship systems...]");
        profile.learnSystem("Navigation");
        profile.learnSystem("Life Support");
        profile.learnSystem("Propulsion");
        
        System.out.println("Current skill level: " + profile.getSkillLevel());
        System.out.println("Learned systems: " + profile.getLearnedSystems());
        System.out.println("[After more interactions...]\n");
        
        // Progress to COOPERATIVE
        mittenz.progressRelationshipStage();
        
        // Stage 3: COOPERATIVE - Accepting and working together
        System.out.println("\n--- STAGE 3: COOPERATIVE (Skill Level: " + profile.getSkillLevel() + ") ---");
        System.out.println("Mittenz accepts the situation and wants to work together.\n");
        
        System.out.println("Mittenz's dialogues:");
        for (int i = 0; i < 3; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        System.out.println("\nPlayer interactions:");
        mittenz.respondToQuery("Can you help me?");
        mittenz.respondToQuery("Thanks for your help");
        
        // Continue building skill
        System.out.println("\n[Mittenz continues learning and improving...]");
        profile.increaseSkillLevel(30);
        System.out.println("Current skill level: " + profile.getSkillLevel());
        
        // Show high-skill dialogues
        System.out.println("\nAs skill improves, dialogues evolve:");
        for (int i = 0; i < 2; i++) {
            mittenz.provideCompanionDialogue();
        }
        
        // Demonstrate memory system
        System.out.println("\n--- Memory Fragments ---");
        System.out.println("Mittenz occasionally remembers her past:");
        System.out.println("• " + profile.getMemoryFragment());
        System.out.println("• " + profile.getMemoryFragment());
        
        // Show character information
        System.out.println("\n--- Character Profile ---");
        System.out.println("Name: " + profile.getName());
        System.out.println("Current Stage: " + profile.getRelationshipStage());
        System.out.println("Skill Level: " + profile.getSkillLevel() + "/100");
        System.out.println("Personality Traits:");
        for (String trait : profile.getPersonalityTraits()) {
            System.out.println("  • " + trait);
        }
        System.out.println("Special Abilities:");
        for (String ability : profile.getSpecialAbilities()) {
            System.out.println("  • " + ability);
        }
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("\nKey Features Demonstrated:");
        System.out.println("✓ Relationship stage progression (HOSTILE → CURIOUS → COOPERATIVE)");
        System.out.println("✓ Skill level tracking and improvement");
        System.out.println("✓ Stage-specific dialogues from original issue");
        System.out.println("✓ Skill-based dialogue evolution");
        System.out.println("✓ System learning mechanics");
        System.out.println("✓ Memory fragments from backstory");
        System.out.println("✓ Automatic progression via interactions");
    }
}
